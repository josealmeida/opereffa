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
// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from aom.proto

package uk.ac.ucl.bosphorus.protostuff;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.Schema;

public final class ARCHETYPEONTOLOGY implements Externalizable, Message<ARCHETYPEONTOLOGY>
{

    public static Schema<ARCHETYPEONTOLOGY> getSchema()
    {
        return SCHEMA;
    }

    public static ARCHETYPEONTOLOGY getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final ARCHETYPEONTOLOGY DEFAULT_INSTANCE = new ARCHETYPEONTOLOGY();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    List<CodeDefinitionSet> termdefinitions;
    List<CodeDefinitionSet> constraintdefinitions;
    List<TermBindingSet> termbindings;
    List<ConstraintBindingSet> constraintbindings;

    public ARCHETYPEONTOLOGY()
    {
        
    }

    // getters and setters

    // termdefinitions

    public List<CodeDefinitionSet> getTermdefinitionsList()
    {
        return termdefinitions;
    }

    public void setTermdefinitionsList(List<CodeDefinitionSet> termdefinitions)
    {
        this.termdefinitions = termdefinitions;
    }

    // constraintdefinitions

    public List<CodeDefinitionSet> getConstraintdefinitionsList()
    {
        return constraintdefinitions;
    }

    public void setConstraintdefinitionsList(List<CodeDefinitionSet> constraintdefinitions)
    {
        this.constraintdefinitions = constraintdefinitions;
    }

    // termbindings

    public List<TermBindingSet> getTermbindingsList()
    {
        return termbindings;
    }

    public void setTermbindingsList(List<TermBindingSet> termbindings)
    {
        this.termbindings = termbindings;
    }

    // constraintbindings

    public List<ConstraintBindingSet> getConstraintbindingsList()
    {
        return constraintbindings;
    }

    public void setConstraintbindingsList(List<ConstraintBindingSet> constraintbindings)
    {
        this.constraintbindings = constraintbindings;
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, SCHEMA);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, SCHEMA);
    }

    // message method

    public Schema<ARCHETYPEONTOLOGY> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<ARCHETYPEONTOLOGY> SCHEMA = new Schema<ARCHETYPEONTOLOGY>()
    {
        // schema methods

        public ARCHETYPEONTOLOGY newMessage()
        {
            return new ARCHETYPEONTOLOGY();
        }

        public Class<ARCHETYPEONTOLOGY> typeClass()
        {
            return ARCHETYPEONTOLOGY.class;
        }

        public String messageName()
        {
            return ARCHETYPEONTOLOGY.class.getSimpleName();
        }

        public String messageFullName()
        {
            return ARCHETYPEONTOLOGY.class.getName();
        }

        public boolean isInitialized(ARCHETYPEONTOLOGY message)
        {
            return true;
        }

        public void mergeFrom(Input input, ARCHETYPEONTOLOGY message) throws IOException
        {
            for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
            {
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        if(message.termdefinitions == null)
                            message.termdefinitions = new ArrayList<CodeDefinitionSet>();
                        message.termdefinitions.add(input.mergeObject(null, CodeDefinitionSet.getSchema()));
                        break;

                    case 2:
                        if(message.constraintdefinitions == null)
                            message.constraintdefinitions = new ArrayList<CodeDefinitionSet>();
                        message.constraintdefinitions.add(input.mergeObject(null, CodeDefinitionSet.getSchema()));
                        break;

                    case 3:
                        if(message.termbindings == null)
                            message.termbindings = new ArrayList<TermBindingSet>();
                        message.termbindings.add(input.mergeObject(null, TermBindingSet.getSchema()));
                        break;

                    case 4:
                        if(message.constraintbindings == null)
                            message.constraintbindings = new ArrayList<ConstraintBindingSet>();
                        message.constraintbindings.add(input.mergeObject(null, ConstraintBindingSet.getSchema()));
                        break;

                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, ARCHETYPEONTOLOGY message) throws IOException
        {
            if(message.termdefinitions != null)
            {
                for(CodeDefinitionSet termdefinitions : message.termdefinitions)
                {
                    if(termdefinitions != null)
                        output.writeObject(1, termdefinitions, CodeDefinitionSet.getSchema(), true);
                }
            }


            if(message.constraintdefinitions != null)
            {
                for(CodeDefinitionSet constraintdefinitions : message.constraintdefinitions)
                {
                    if(constraintdefinitions != null)
                        output.writeObject(2, constraintdefinitions, CodeDefinitionSet.getSchema(), true);
                }
            }


            if(message.termbindings != null)
            {
                for(TermBindingSet termbindings : message.termbindings)
                {
                    if(termbindings != null)
                        output.writeObject(3, termbindings, TermBindingSet.getSchema(), true);
                }
            }


            if(message.constraintbindings != null)
            {
                for(ConstraintBindingSet constraintbindings : message.constraintbindings)
                {
                    if(constraintbindings != null)
                        output.writeObject(4, constraintbindings, ConstraintBindingSet.getSchema(), true);
                }
            }

        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "termdefinitions";
                case 2: return "constraintdefinitions";
                case 3: return "termbindings";
                case 4: return "constraintbindings";
                default: return null;
            }
        }

        public int getFieldNumber(String name)
        {
            final Integer number = fieldMap.get(name);
            return number == null ? 0 : number.intValue();
        }

        final java.util.HashMap<String,Integer> fieldMap = new java.util.HashMap<String,Integer>();
        {
            fieldMap.put("termdefinitions", 1);
            fieldMap.put("constraintdefinitions", 2);
            fieldMap.put("termbindings", 3);
            fieldMap.put("constraintbindings", 4);
        }
    };
    
}
