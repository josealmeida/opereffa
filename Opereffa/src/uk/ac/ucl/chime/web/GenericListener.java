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

import javax.faces.component.ContextCallback;
import javax.faces.component.EditableValueHolder;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpServletRequest;

import java.util.Iterator;
import java.util.Map;

public class GenericListener implements PhaseListener {
	
	

    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
    
    public void beforePhase(PhaseEvent e) {
    	System.out.print("BEFORE " + e.getPhaseId());
    }

    public void afterPhase(PhaseEvent e) {
        System.out.print("AFTER " + e.getPhaseId());
    }
}

