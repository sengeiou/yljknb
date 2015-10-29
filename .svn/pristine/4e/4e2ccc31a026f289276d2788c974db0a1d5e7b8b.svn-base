package com.wondersgroup.wssip.commons.javatxt.core;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Vector;

import com.wondersgroup.wsscclib.javadbf.core.Utils;
import com.wondersgroup.wssip.commons.javatxt.mapping.TXTField;

class TXTHeader {
	int numberOfRecords;
	TXTField[] fieldArray;

	TXTHeader() {
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	void read(DataInput dataInput) throws IOException {

		numberOfRecords = Utils.readLittleEndianInt(dataInput); /* 4-7 */

		Vector v_fields = new Vector();

		TXTField field = TXTField.createField(dataInput); /* 32 each */
		while (field != null) {

			v_fields.addElement(field);
			field = TXTField.createField(dataInput);
		}

		fieldArray = new TXTField[v_fields.size()];

		for (int i = 0; i < fieldArray.length; i++) {

			fieldArray[i] = (TXTField) v_fields.elementAt(i);
		}
		//System.out.println( "Number of fields: " + fieldArray.length);

	}

	void write(DataOutput dataOutput) throws IOException {
		for (int i = 0; i < fieldArray.length; i++) {
			fieldArray[i].write(dataOutput);
		}
		
	}

	
}
