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

public final class DVPROPORTION implements Externalizable, Message<DVPROPORTION>
{

    public static Schema<DVPROPORTION> getSchema()
    {
        return SCHEMA;
    }

    public static DVPROPORTION getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final DVPROPORTION DEFAULT_INSTANCE = new DVPROPORTION();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    String numerator;
    String denominator;
    String type;
    Integer precision;
    DVINTERVAL normalrange;
    List<REFERENCERANGE> otherreferenceranges;
    CODEPHRASE normalstatus;
    String magnitudestatus;
    String accuracy;
    Boolean accuracyispercent;

    public DVPROPORTION()
    {
        
    }

    public DVPROPORTION(
        String type
    )
    {
        this.type = type;
    }

    // getters and setters

    // numerator

    public String getNumerator()
    {
        return numerator;
    }

    public void setNumerator(String numerator)
    {
        this.numerator = numerator;
    }

    // denominator

    public String getDenominator()
    {
        return denominator;
    }

    public void setDenominator(String denominator)
    {
        this.denominator = denominator;
    }

    // type

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    // precision

    public Integer getPrecision()
    {
        return precision;
    }

    public void setPrecision(Integer precision)
    {
        this.precision = precision;
    }

    // normalrange

    public DVINTERVAL getNormalrange()
    {
        return normalrange;
    }

    public void setNormalrange(DVINTERVAL normalrange)
    {
        this.normalrange = normalrange;
    }

    // otherreferenceranges

    public List<REFERENCERANGE> getOtherreferencerangesList()
    {
        return otherreferenceranges;
    }

    public void setOtherreferencerangesList(List<REFERENCERANGE> otherreferenceranges)
    {
        this.otherreferenceranges = otherreferenceranges;
    }

    // normalstatus

    public CODEPHRASE getNormalstatus()
    {
        return normalstatus;
    }

    public void setNormalstatus(CODEPHRASE normalstatus)
    {
        this.normalstatus = normalstatus;
    }

    // magnitudestatus

    public String getMagnitudestatus()
    {
        return magnitudestatus;
    }

    public void setMagnitudestatus(String magnitudestatus)
    {
        this.magnitudestatus = magnitudestatus;
    }

    // accuracy

    public String getAccuracy()
    {
        return accuracy;
    }

    public void setAccuracy(String accuracy)
    {
        this.accuracy = accuracy;
    }

    // accuracyispercent

    public Boolean getAccuracyispercent()
    {
        return accuracyispercent;
    }

    public void setAccuracyispercent(Boolean accuracyispercent)
    {
        this.accuracyispercent = accuracyispercent;
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

    public Schema<DVPROPORTION> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<DVPROPORTION> SCHEMA = new Schema<DVPROPORTION>()
    {
        // schema methods

        public DVPROPORTION newMessage()
        {
            return new DVPROPORTION();
        }

        public Class<DVPROPORTION> typeClass()
        {
            return DVPROPORTION.class;
        }

        public String messageName()
        {
            return DVPROPORTION.class.getSimpleName();
        }

        public String messageFullName()
        {
            return DVPROPORTION.class.getName();
        }

        public boolean isInitialized(DVPROPORTION message)
        {
            return 
                message.type != null;
        }

        public void mergeFrom(Input input, DVPROPORTION message) throws IOException
        {
            for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
            {
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        message.numerator = input.readString();
                        break;
                    case 2:
                        message.denominator = input.readString();
                        break;
                    case 3:
                        message.type = input.readString();
                        break;
                    case 4:
                        message.precision = input.readInt32();
                        break;
                    case 5:
                        message.normalrange = input.mergeObject(message.normalrange, DVINTERVAL.getSchema());
                        break;

                    case 6:
                        if(message.otherreferenceranges == null)
                            message.otherreferenceranges = new ArrayList<REFERENCERANGE>();
                        message.otherreferenceranges.add(input.mergeObject(null, REFERENCERANGE.getSchema()));
                        break;

                    case 7:
                        message.normalstatus = input.mergeObject(message.normalstatus, CODEPHRASE.getSchema());
                        break;

                    case 8:
                        message.magnitudestatus = input.readString();
                        break;
                    case 9:
                        message.accuracy = input.readString();
                        break;
                    case 10:
                        message.accuracyispercent = input.readBool();
                        break;
                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, DVPROPORTION message) throws IOException
        {
            if(message.numerator != null)
                output.writeString(1, message.numerator, false);

            if(message.denominator != null)
                output.writeString(2, message.denominator, false);

            if(message.type == null)
                throw new UninitializedMessageException(message);
            output.writeString(3, message.type, false);

            if(message.precision != null)
                output.writeInt32(4, message.precision, false);

            if(message.normalrange != null)
                 output.writeObject(5, message.normalrange, DVINTERVAL.getSchema(), false);


            if(message.otherreferenceranges != null)
            {
                for(REFERENCERANGE otherreferenceranges : message.otherreferenceranges)
                {
                    if(otherreferenceranges != null)
                        output.writeObject(6, otherreferenceranges, REFERENCERANGE.getSchema(), true);
                }
            }


            if(message.normalstatus != null)
                 output.writeObject(7, message.normalstatus, CODEPHRASE.getSchema(), false);


            if(message.magnitudestatus != null)
                output.writeString(8, message.magnitudestatus, false);

            if(message.accuracy != null)
                output.writeString(9, message.accuracy, false);

            if(message.accuracyispercent != null)
                output.writeBool(10, message.accuracyispercent, false);
        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "numerator";
                case 2: return "denominator";
                case 3: return "type";
                case 4: return "precision";
                case 5: return "normalrange";
                case 6: return "otherreferenceranges";
                case 7: return "normalstatus";
                case 8: return "magnitudestatus";
                case 9: return "accuracy";
                case 10: return "accuracyispercent";
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
            fieldMap.put("numerator", 1);
            fieldMap.put("denominator", 2);
            fieldMap.put("type", 3);
            fieldMap.put("precision", 4);
            fieldMap.put("normalrange", 5);
            fieldMap.put("otherreferenceranges", 6);
            fieldMap.put("normalstatus", 7);
            fieldMap.put("magnitudestatus", 8);
            fieldMap.put("accuracy", 9);
            fieldMap.put("accuracyispercent", 10);
        }
    };
    
}
