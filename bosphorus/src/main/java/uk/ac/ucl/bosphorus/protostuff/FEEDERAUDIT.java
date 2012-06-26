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

public final class FEEDERAUDIT implements Externalizable, Message<FEEDERAUDIT>
{

    public static Schema<FEEDERAUDIT> getSchema()
    {
        return SCHEMA;
    }

    public static FEEDERAUDIT getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final FEEDERAUDIT DEFAULT_INSTANCE = new FEEDERAUDIT();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    List<DVIDENTIFIER> originatingsystemitemids;
    List<DVIDENTIFIER> feedersystemitemids;
    DVENCAPSULATEDALTERNATIVES originalcontent;
    FEEDERAUDITDETAILS originatingsystemaudit;
    FEEDERAUDITDETAILS feedersystemaudit;

    public FEEDERAUDIT()
    {
        
    }

    public FEEDERAUDIT(
        FEEDERAUDITDETAILS originatingsystemaudit
    )
    {
        this.originatingsystemaudit = originatingsystemaudit;
    }

    // getters and setters

    // originatingsystemitemids

    public List<DVIDENTIFIER> getOriginatingsystemitemidsList()
    {
        return originatingsystemitemids;
    }

    public void setOriginatingsystemitemidsList(List<DVIDENTIFIER> originatingsystemitemids)
    {
        this.originatingsystemitemids = originatingsystemitemids;
    }

    // feedersystemitemids

    public List<DVIDENTIFIER> getFeedersystemitemidsList()
    {
        return feedersystemitemids;
    }

    public void setFeedersystemitemidsList(List<DVIDENTIFIER> feedersystemitemids)
    {
        this.feedersystemitemids = feedersystemitemids;
    }

    // originalcontent

    public DVENCAPSULATEDALTERNATIVES getOriginalcontent()
    {
        return originalcontent;
    }

    public void setOriginalcontent(DVENCAPSULATEDALTERNATIVES originalcontent)
    {
        this.originalcontent = originalcontent;
    }

    // originatingsystemaudit

    public FEEDERAUDITDETAILS getOriginatingsystemaudit()
    {
        return originatingsystemaudit;
    }

    public void setOriginatingsystemaudit(FEEDERAUDITDETAILS originatingsystemaudit)
    {
        this.originatingsystemaudit = originatingsystemaudit;
    }

    // feedersystemaudit

    public FEEDERAUDITDETAILS getFeedersystemaudit()
    {
        return feedersystemaudit;
    }

    public void setFeedersystemaudit(FEEDERAUDITDETAILS feedersystemaudit)
    {
        this.feedersystemaudit = feedersystemaudit;
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

    public Schema<FEEDERAUDIT> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<FEEDERAUDIT> SCHEMA = new Schema<FEEDERAUDIT>()
    {
        // schema methods

        public FEEDERAUDIT newMessage()
        {
            return new FEEDERAUDIT();
        }

        public Class<FEEDERAUDIT> typeClass()
        {
            return FEEDERAUDIT.class;
        }

        public String messageName()
        {
            return FEEDERAUDIT.class.getSimpleName();
        }

        public String messageFullName()
        {
            return FEEDERAUDIT.class.getName();
        }

        public boolean isInitialized(FEEDERAUDIT message)
        {
            return 
                message.originatingsystemaudit != null;
        }

        public void mergeFrom(Input input, FEEDERAUDIT message) throws IOException
        {
            for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
            {
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        if(message.originatingsystemitemids == null)
                            message.originatingsystemitemids = new ArrayList<DVIDENTIFIER>();
                        message.originatingsystemitemids.add(input.mergeObject(null, DVIDENTIFIER.getSchema()));
                        break;

                    case 2:
                        if(message.feedersystemitemids == null)
                            message.feedersystemitemids = new ArrayList<DVIDENTIFIER>();
                        message.feedersystemitemids.add(input.mergeObject(null, DVIDENTIFIER.getSchema()));
                        break;

                    case 3:
                        message.originalcontent = input.mergeObject(message.originalcontent, DVENCAPSULATEDALTERNATIVES.getSchema());
                        break;

                    case 4:
                        message.originatingsystemaudit = input.mergeObject(message.originatingsystemaudit, FEEDERAUDITDETAILS.getSchema());
                        break;

                    case 5:
                        message.feedersystemaudit = input.mergeObject(message.feedersystemaudit, FEEDERAUDITDETAILS.getSchema());
                        break;

                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, FEEDERAUDIT message) throws IOException
        {
            if(message.originatingsystemitemids != null)
            {
                for(DVIDENTIFIER originatingsystemitemids : message.originatingsystemitemids)
                {
                    if(originatingsystemitemids != null)
                        output.writeObject(1, originatingsystemitemids, DVIDENTIFIER.getSchema(), true);
                }
            }


            if(message.feedersystemitemids != null)
            {
                for(DVIDENTIFIER feedersystemitemids : message.feedersystemitemids)
                {
                    if(feedersystemitemids != null)
                        output.writeObject(2, feedersystemitemids, DVIDENTIFIER.getSchema(), true);
                }
            }


            if(message.originalcontent != null)
                 output.writeObject(3, message.originalcontent, DVENCAPSULATEDALTERNATIVES.getSchema(), false);


            if(message.originatingsystemaudit == null)
                throw new UninitializedMessageException(message);
            output.writeObject(4, message.originatingsystemaudit, FEEDERAUDITDETAILS.getSchema(), false);


            if(message.feedersystemaudit != null)
                 output.writeObject(5, message.feedersystemaudit, FEEDERAUDITDETAILS.getSchema(), false);

        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "originatingsystemitemids";
                case 2: return "feedersystemitemids";
                case 3: return "originalcontent";
                case 4: return "originatingsystemaudit";
                case 5: return "feedersystemaudit";
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
            fieldMap.put("originatingsystemitemids", 1);
            fieldMap.put("feedersystemitemids", 2);
            fieldMap.put("originalcontent", 3);
            fieldMap.put("originatingsystemaudit", 4);
            fieldMap.put("feedersystemaudit", 5);
        }
    };
    
}
