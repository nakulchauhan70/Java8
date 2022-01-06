package com.demo.staticdefaultmethod;

import java.util.Collections;
import java.util.List;

public class MyClass implements StudentInterface {

	@Override
	public Integer getMaxNum(List<Integer> intList) {
		return Collections.max(intList);
	}

}
