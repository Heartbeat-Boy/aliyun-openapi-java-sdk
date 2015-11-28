/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.push.model.v20150827;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class PushNoticeToiOSRequest extends RpcAcsRequest<PushNoticeToiOSResponse> {
	
	public PushNoticeToiOSRequest() {
		super("Push", "2015-08-27", "PushNoticeToiOS");
	}

	private Long appKey;

	private String target;

	private String targetValue;

	private String ext;

	private String env;

	private String summary;

	public Long getAppKey() {
		return this.appKey;
	}

	public void setAppKey(Long appKey) {
		this.appKey = appKey;
		putQueryParameter("AppKey", appKey);
	}

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
		putQueryParameter("Target", target);
	}

	public String getTargetValue() {
		return this.targetValue;
	}

	public void setTargetValue(String targetValue) {
		this.targetValue = targetValue;
		putQueryParameter("TargetValue", targetValue);
	}

	public String getExt() {
		return this.ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
		putQueryParameter("Ext", ext);
	}

	public String getEnv() {
		return this.env;
	}

	public void setEnv(String env) {
		this.env = env;
		putQueryParameter("Env", env);
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
		putQueryParameter("Summary", summary);
	}

	@Override
	public Class<PushNoticeToiOSResponse> getResponseClass() {
		return PushNoticeToiOSResponse.class;
	}

}
