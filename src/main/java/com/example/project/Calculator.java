/*
 * Copyright 2015-2021 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

public class Calculator {
	
	static public void main(String[] args) {
		System.out.println("Calculator TEST!!!!!!! CI/DI!!!!!!!!");
		
		//=========================================================
		DeepThought ourSuperComputer = new DeepThought();
        int ans = ourSuperComputer.answer_to_the_ultimate_question_of_life_the_universe_and_everything();

        //RedisJava cache = new RedisJava();
       // cache.cache_value("answer_to_the_ultimate_question_of_life_the_universe_and_everything",String.valueOf(ans));

       // System.out.println("Cached value: " + cache.get_cached_value("answer_to_the_ultimate_question_of_life_the_universe_and_everything"));
		//=========================================================
	}

	public int add(int a, int b) {
		return a + b;
	}

}
