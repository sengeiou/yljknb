/*
  DBFField
	Class represents a "field" (or column) definition of a DBF data structure.

  This file is part of JavaDBF packege.

  author: anil@linuxense.com
  license: LGPL (http://www.gnu.org/copyleft/lesser.html)

  $Id: DBFField.java 14672 2009-04-15 14:55:33Z Suhl $
 */

package com.wondersgroup.wssip.commons.javatxt.mapping;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * DBFField represents a field specification in an dbf file.
 * 
 * DBFField objects are either created and added to a DBFWriter object or
 * obtained from DBFReader object through getField( int) query.
 * 
 */
public class TXTField {

	public static final byte FIELD_TYPE_C = (byte) 'C';
	public static final byte FIELD_TYPE_L = (byte) 'L';
	public static final byte FIELD_TYPE_N = (byte) 'N';
	public static final byte FIELD_TYPE_F = (byte) 'F';
	public static final byte FIELD_TYPE_D = (byte) 'D';
	public static final byte FIELD_TYPE_M = (byte) 'M';

	/* Field struct variables start here */
	byte[] fieldName = new byte[11]; /* 0-10 */
	byte dataType; /* 11 */
	int fieldLength; /* 16 */
	byte decimalCount; /* 17 */

	/* other class variables */
	int nameNullIndex = 0;

	/**
	 * Creates a DBFField object from the data read from the given
	 * DataInputStream.
	 * 
	 * The data in the DataInputStream object is supposed to be organised
	 * correctly and the stream "pointer" is supposed to be positioned properly.
	 * 
	 * @param in
	 *            DataInputStream
	 * @return Returns the created DBFField object.
	 * @throws IOException
	 *             If any stream reading problems occures.
	 */
	public static TXTField createField(DataInput in) throws IOException {

		TXTField field = new TXTField();

		byte t_byte = in.readByte(); /* 0 */
		if (t_byte == (byte) 0x0d) {

			// System.out.println( "End of header found");
			return null;
		}

		in.readFully(field.fieldName, 1, 10); /* 1-10 */
		field.fieldName[0] = t_byte;

		for (int i = 0; i < field.fieldName.length; i++) {

			if (field.fieldName[i] == (byte) 0) {

				field.nameNullIndex = i;
				break;
			}
		}
		field.dataType = in.readByte(); /* 11 */
		field.fieldLength = in.readUnsignedByte(); /* 16 */
		field.decimalCount = in.readByte(); /* 17 */
		return field;
	}

	/**
	 * Writes the content of DBFField object into the stream as per DBF format
	 * specifications.
	 * 
	 * @param os
	 *            OutputStream
	 * @throws IOException
	 *             if any stream related issues occur.
	 */
	public void write(DataOutput out) throws IOException {
		// DataOutputStream out = new DataOutputStream( os);

		// Field Name
		//out.write(fieldName); /* 0-10 */
		//out.write(new byte[11 - fieldName.length]);
		//out.writeByte(dataType); /* 11 */
		//out.writeByte(fieldLength); /* 16 */
		//out.writeByte(decimalCount); /* 17 */

	}

	/**
	 * Returns the name of the field.
	 * 
	 * @return Name of the field as String.
	 */
	public String getName() {

		return new String(this.fieldName, 0, nameNullIndex);
	}

	/**
	 * Returns the data type of the field.
	 * 
	 * @return Data type as byte.
	 */
	public byte getDataType() {

		return dataType;
	}

	/**
	 * Returns the data type of the field.
	 * 
	 * @return Data type as byte.
	 */

	/**
	 * @deprecated This method is depricated as of version 0.3.3.1 and is
	 *             replaced by {@link #setName( String)}.
	 */
	public void setFieldName(String value) {

		setName(value);
	}

	/**
	 * Sets the data type of the field.
	 * 
	 * @param type
	 *            of the field. One of the following:<br>
	 *            C, L, N, F, D, M
	 */
	public void setDataType(byte value) {

		switch (value) {

		case 'D':
			this.fieldLength = 8; /* fall through */
		case 'C':
		case 'L':
		case 'N':
		case 'F':
		case 'M':

			this.dataType = value;
			break;

		default:
			throw new IllegalArgumentException("Unknown data type");
		}
	}

	/**
	 * Sets the name of the field.
	 * 
	 * @param name
	 *            of the field as String.
	 * @since 0.3.3.1
	 */
	public void setName(String value) {

		if (value == null) {

			throw new IllegalArgumentException("Field name cannot be null");
		}

		if (value.length() == 0 || value.length() > 10) {

			throw new IllegalArgumentException(
					"Field name should be of length 0-10");
		}

		this.fieldName = value.getBytes();
		this.nameNullIndex = this.fieldName.length;
	}

	public int getFieldLength() {

		return fieldLength;
	}

	/**
	 * Returns the decimal part. This is applicable only if the field type if of
	 * numeric in nature.
	 * 
	 * If the field is specified to hold integral values the value returned by
	 * this method will be zero.
	 * 
	 * @return decimal field size as int.
	 */
	public int getDecimalCount() {

		return decimalCount;
	}

	/**
	 * Length of the field. This method should be called before calling
	 * setDecimalCount().
	 * 
	 * @param Length
	 *            of the field as int.
	 */
	public void setFieldLength(int value) {

		if (value <= 0) {

			throw new IllegalArgumentException(
					"Field length should be a positive number");
		}

		if (this.dataType == FIELD_TYPE_D) {

			throw new UnsupportedOperationException(
					"Cannot do this on a Date field");
		}

		fieldLength = value;
	}

	/**
	 * Sets the decimal place size of the field. Before calling this method the
	 * size of the field should be set by calling setFieldLength().
	 * 
	 * @param Size
	 *            of the decimal field.
	 */
	public void setDecimalCount(int value) {

		if (value < 0) {

			throw new IllegalArgumentException(
					"Decimal length should be a positive number");
		}

		if (value > fieldLength) {

			throw new IllegalArgumentException(
					"Decimal length should be less than field length");
		}

		decimalCount = (byte) value;
	}

}
