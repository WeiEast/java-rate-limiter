/**
 * Copyright (c) 2013-2020, cpthack 成佩涛 (cpt@jianzhimao.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.cpthack.commons.ratelimiter.limiter;

import com.github.cpthack.commons.ratelimiter.base.AbstractBaseFactory;

/**
 * <b>LimiterFactory.java</b></br>
 * 
 * <pre>
 * 限流工厂类
 * </pre>
 *
 * @author cpthack cpt@jianzhimao.com
 * @date May 17, 2017 12:18:47 AM
 * @since JDK 1.7
 */
public class LimiterFactory extends AbstractBaseFactory<Limiter> {
	
	private final static LimiterFactory factory = new LimiterFactory();
	
	public LimiterFactory() {
		super(SingleLimiter.class, DistributedLimiter.class);
	}
	
	public static LimiterFactory getInstance() {
		return factory;
	}
}
