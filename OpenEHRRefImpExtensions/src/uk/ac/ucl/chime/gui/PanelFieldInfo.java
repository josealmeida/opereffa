/*******************************************************************************
 * Copyright 2012 Sevket Seref Arikan, David Ingram
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package uk.ac.ucl.chime.gui;

public class PanelFieldInfo{
	public String instanceName;
	public String createInstanceStatement;
	public String setInstanceValueStatement;
	public String instanceFullTypeName;
	public String instanceValue;
	public String customCodeForXML;
	public int width = -1;
	public int height = -1;
	public PanelFieldInfo(){}
	public PanelFieldInfo(String pInstanceName, String pCreateInstanceStatement, String pSetInstanceValueStatement, String pInstanceFullTypeName, String pInstanceValue){
		instanceName = pInstanceName;
		createInstanceStatement = pCreateInstanceStatement;
		setInstanceValueStatement = pSetInstanceValueStatement;
		instanceFullTypeName = pInstanceFullTypeName;
		instanceValue = pInstanceValue;
	}
}
