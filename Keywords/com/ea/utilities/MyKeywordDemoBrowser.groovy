package com.ea.utilities

import com.kms.katalon.core.annotation.Keyword

public class MyKeywordDemoBrowser {

	@Keyword(keywordObject = "browser")
	def helloUser1(String user1) {
		println("Hello " +user1)
	}
}
