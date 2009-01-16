package com.zzh.lang.types.castor;

import java.sql.Timestamp;

public class Timestamp2String extends DateTimeCastor<Timestamp,String> {

	@Override
	protected Object cast(Object src) {
		return dateTimeFormat.format(new java.util.Date(((Timestamp) src).getTime()));
	}

}
