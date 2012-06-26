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
import com.dyuproject.protostuff.UninitializedMessageException;

public final class TRANSLATIONDETAILS implements Externalizable, Message<TRANSLATIONDETAILS>
{

    public static Schema<TRANSLATIONDETAILS> getSchema()
    {
        return SCHEMA;
    }

    public static TRANSLATIONDETAILS getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final TRANSLATIONDETAILS DEFAULT_INSTANCE = new TRANSLATIONDETAILS();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    CODEPHRASE language;
    List<StringDictionaryItem> author;
    String accreditation;
    List<StringDictionaryItem> otherdetails;

    public TRANSLATIONDETAILS()
    {
        
    }

    public TRANSLATIONDETAILS(
        CODEPHRASE language
    )
    {
        this.language = language;
    }

    // getters and setters

    // language

    public CODEPHRASE getLanguage()
    {
        return language;
    }

    public void setLanguage(CODEPHRASE language)
    {
        this.language = language;
    }

    // author

    public List<StringDictionaryItem> getAuthorList()
    {
        return author;
    }

    public void setAuthorList(List<StringDictionaryItem> author)
    {
        this.author = author;
    }

    // accreditation

    public String getAccreditation()
    {
        return accreditation;
    }

    public void setAccreditation(String accreditation)
    {
        this.accreditation = accreditation;
    }

    // otherdetails

    public List<StringDictionaryItem> getOtherdetailsList()
    {
        return otherdetails;
    }

    public void setOtherdetailsList(List<StringDictionaryItem> otherdetails)
    {
        this.otherdetails = otherdetails;
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

    public Schema<TRANSLATIONDETAILS> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<TRANSLATIONDETAILS> SCHEMA = new Schema<TRANSLATIONDETAILS>()
    {
        // schema methods

        public TRANSLATIONDETAILS newMessage()
        {
            return new TRANSLATIONDETAILS();
        }

        public Class<TRANSLATIONDETAILS> typeClass()
        {
            return TRANSLATIONDETAILS.class;
        }

        public String messageName()
        {
            return TRANSLATIONDETAILS.class.getSimpleName();
        }

        public String messageFullName()
        {
            return TRANSLATIONDETAILS.class.getName();
        }

        public boolean isInitialized(TRANSLATIONDETAILS message)
        {
            return 
                message.language != null;
        }

        public void mergeFrom(Input input, TRANSLATIONDETAILS message) throws IOException
        {
            for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
            {
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        message.language = input.mergeObject(message.language, CODEPHRASE.getSchema());
                        break;

                    case 2:
                        if(message.author == null)
                            message.author = new ArrayList<StringDictionaryItem>();
                        message.author.add(input.mergeObject(null, StringDictionaryItem.getSchema()));
                        break;

                    case 3:
                        message.accreditation = input.readString();
                        break;
                    case 4:
                        if(message.otherdetails == null)
                            message.otherdetails = new ArrayList<StringDictionaryItem>();
                        message.otherdetails.add(input.mergeObject(null, StringDictionaryItem.getSchema()));
                        break;

                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, TRANSLATIONDETAILS message) throws IOException
        {
            if(message.language == null)
                throw new UninitializedMessageException(message);
            output.writeObject(1, message.language, CODEPHRASE.getSchema(), false);


            if(message.author != null)
            {
                for(StringDictionaryItem author : message.author)
                {
                    if(author != null)
                        output.writeObject(2, author, StringDictionaryItem.getSchema(), true);
                }
            }


            if(message.accreditation != null)
                output.writeString(3, message.accreditation, false);

            if(message.otherdetails != null)
            {
                for(StringDictionaryItem otherdetails : message.otherdetails)
                {
                    if(otherdetails != null)
                        output.writeObject(4, otherdetails, StringDictionaryItem.getSchema(), true);
                }
            }

        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "language";
                case 2: return "author";
                case 3: return "accreditation";
                case 4: return "otherdetails";
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
            fieldMap.put("language", 1);
            fieldMap.put("author", 2);
            fieldMap.put("accreditation", 3);
            fieldMap.put("otherdetails", 4);
        }
    };
    
}
