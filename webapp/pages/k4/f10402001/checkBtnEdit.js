function checkButtonEdit(e) {
    	if (e.isValid) {
            if (e.value==0) {
                e.errorText = "不能为空";
                e.isValid = false;
            }
        }
    }
