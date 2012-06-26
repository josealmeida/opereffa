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
package uk.ac.ucl.chime.web;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;

import uk.ac.ucl.chime.wrappers.archetypewrappers.ArchetypeWrapper;



public class ArchetypeValueValidator {
	protected ArchetypeWrapper archetypeWrapper;
	
	public ArchetypeValueValidator(ArchetypeWrapper pWrapper){
		archetypeWrapper = pWrapper;
	}
	
	public void validateNumeric(FacesContext context,UIComponent toValidate,Object value) {
		String email = (String) value;		
		
		((UIInput)toValidate).setValid(false);
		
		FacesMessage message = new FacesMessage("Invalid Email");
		String clientId = toValidate.getClientId(context);
		context.addMessage(clientId, message);
	}


}
