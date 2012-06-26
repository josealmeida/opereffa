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

public final class RESOURCEDESCRIPTIONITEM implements Externalizable, Message<RESOURCEDESCRIPTIONITEM>
{

    public static Schema<RESOURCEDESCRIPTIONITEM> getSchema()
    {
        return SCHEMA;
    }

    public static RESOURCEDESCRIPTIONITEM getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final RESOURCEDESCRIPTIONITEM DEFAULT_INSTANCE = new RESOURCEDESCRIPTIONITEM();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    CODEPHRASE language;
    String purpose;
    List<String> keywords;
    String use;
    String misuse;
    String copyright;
    List<StringDictionaryItem> originalresourceuri;
    List<StringDictionaryItem> otherdetails;

    public RESOURCEDESCRIPTIONITEM()
    {
        
    }

    public RESOURCEDESCRIPTIONITEM(
        CODEPHRASE language,
        String purpose
    )
    {
        this.language = language;
        this.purpose = purpose;
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

    // purpose

    public String getPurpose()
    {
        return purpose;
    }

    public void setPurpose(String purpose)
    {
        this.purpose = purpose;
    }

    // keywords

    public List<String> getKeywordsList()
    {
        return keywords;
    }

    public void setKeywordsList(List<String> keywords)
    {
        this.keywords = keywords;
    }

    // use

    public String getUse()
    {
        return use;
    }

    public void setUse(String use)
    {
        this.use = use;
    }

    // misuse

    public String getMisuse()
    {
        return misuse;
    }

    public void setMisuse(String misuse)
    {
        this.misuse = misuse;
    }

    // copyright

    public String getCopyright()
    {
        return copyright;
    }

    public void setCopyright(String copyright)
    {
        this.copyright = copyright;
    }

    // originalresourceuri

    public List<StringDictionaryItem> getOriginalresourceuriList()
    {
        return originalresourceuri;
    }

    public void setOriginalresourceuriList(List<StringDictionaryItem> originalresourceuri)
    {
        this.originalresourceuri = originalresourceuri;
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

    public Schema<RESOURCEDESCRIPTIONITEM> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<RESOURCEDESCRIPTIONITEM> SCHEMA = new Schema<RESOURCEDESCRIPTIONITEM>()
    {
        // schema methods

        public RESOURCEDESCRIPTIONITEM newMessage()
        {
            return new RESOURCEDESCRIPTIONITEM();
        }

        public Class<RESOURCEDESCRIPTIONITEM> typeClass()
        {
            return RESOURCEDESCRIPTIONITEM.class;
        }

        public String messageName()
        {
            return RESOURCEDESCRIPTIONITEM.class.getSimpleName();
        }

        public String messageFullName()
        {
            return RESOURCEDESCRIPTIONITEM.class.getName();
        }

        public boolean isInitialized(RESOURCEDESCRIPTIONITEM message)
        {
            return 
                message.language != null 
                && message.purpose != null;
        }

        public void mergeFrom(Input input, RESOURCEDESCRIPTIONITEM message) throws IOException
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
                        message.purpose = input.readString();
                        break;
                    case 3:
                        if(message.keywords == null)
                            message.keywords = new ArrayList<String>();
                        message.keywords.add(input.readString());
                        break;
                    case 4:
                        message.use = input.readString();
                        break;
                    case 5:
                        message.misuse = input.readString();
                        break;
                    case 6:
                        message.copyright = input.readString();
                        break;
                    case 7:
                        if(message.originalresourceuri == null)
                            message.originalresourceuri = new ArrayList<StringDictionaryItem>();
                        message.originalresourceuri.add(input.mergeObject(null, StringDictionaryItem.getSchema()));
                        break;

                    case 8:
                        if(message.otherdetails == null)
                            message.otherdetails = new ArrayList<StringDictionaryItem>();
                        message.otherdetails.add(input.mergeObject(null, StringDictionaryItem.getSchema()));
                        break;

                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, RESOURCEDESCRIPTIONITEM message) throws IOException
        {
            if(message.language == null)
                throw new UninitializedMessageException(message);
            output.writeObject(1, message.language, CODEPHRASE.getSchema(), false);


            if(message.purpose == null)
                throw new UninitializedMessageException(message);
            output.writeString(2, message.purpose, false);

            if(message.keywords != null)
            {
                for(String keywords : message.keywords)
                {
                    if(keywords != null)
                        output.writeString(3, keywords, true);
                }
            }

            if(message.use != null)
                output.writeString(4, message.use, false);

            if(message.misuse != null)
                output.writeString(5, message.misuse, false);

            if(message.copyright != null)
                output.writeString(6, message.copyright, false);

            if(message.originalresourceuri != null)
            {
                for(StringDictionaryItem originalresourceuri : message.originalresourceuri)
                {
                    if(originalresourceuri != null)
                        output.writeObject(7, originalresourceuri, StringDictionaryItem.getSchema(), true);
                }
            }


            if(message.otherdetails != null)
            {
                for(StringDictionaryItem otherdetails : message.otherdetails)
                {
                    if(otherdetails != null)
                        output.writeObject(8, otherdetails, StringDictionaryItem.getSchema(), true);
                }
            }

        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "language";
                case 2: return "purpose";
                case 3: return "keywords";
                case 4: return "use";
                case 5: return "misuse";
                case 6: return "copyright";
                case 7: return "originalresourceuri";
                case 8: return "otherdetails";
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
            fieldMap.put("purpose", 2);
            fieldMap.put("keywords", 3);
            fieldMap.put("use", 4);
            fieldMap.put("misuse", 5);
            fieldMap.put("copyright", 6);
            fieldMap.put("originalresourceuri", 7);
            fieldMap.put("otherdetails", 8);
        }
    };
    
}
