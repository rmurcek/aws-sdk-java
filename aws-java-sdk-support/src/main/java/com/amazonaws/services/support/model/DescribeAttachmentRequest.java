/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.support.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.support.AWSSupport#describeAttachment(DescribeAttachmentRequest) DescribeAttachment operation}.
 * <p>
 * Returns the attachment that has the specified ID. Attachment IDs are
 * generated by the case management system when you add an attachment to
 * a case or case communication. Attachment IDs are returned in the
 * AttachmentDetails objects that are returned by the
 * DescribeCommunications operation.
 * </p>
 *
 * @see com.amazonaws.services.support.AWSSupport#describeAttachment(DescribeAttachmentRequest)
 */
public class DescribeAttachmentRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID of the attachment to return. Attachment IDs are returned by the
     * <a>DescribeCommunications</a> operation.
     */
    private String attachmentId;

    /**
     * The ID of the attachment to return. Attachment IDs are returned by the
     * <a>DescribeCommunications</a> operation.
     *
     * @return The ID of the attachment to return. Attachment IDs are returned by the
     *         <a>DescribeCommunications</a> operation.
     */
    public String getAttachmentId() {
        return attachmentId;
    }
    
    /**
     * The ID of the attachment to return. Attachment IDs are returned by the
     * <a>DescribeCommunications</a> operation.
     *
     * @param attachmentId The ID of the attachment to return. Attachment IDs are returned by the
     *         <a>DescribeCommunications</a> operation.
     */
    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }
    
    /**
     * The ID of the attachment to return. Attachment IDs are returned by the
     * <a>DescribeCommunications</a> operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachmentId The ID of the attachment to return. Attachment IDs are returned by the
     *         <a>DescribeCommunications</a> operation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAttachmentRequest withAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAttachmentId() != null) sb.append("AttachmentId: " + getAttachmentId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAttachmentRequest == false) return false;
        DescribeAttachmentRequest other = (DescribeAttachmentRequest)obj;
        
        if (other.getAttachmentId() == null ^ this.getAttachmentId() == null) return false;
        if (other.getAttachmentId() != null && other.getAttachmentId().equals(this.getAttachmentId()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeAttachmentRequest clone() {
        
            return (DescribeAttachmentRequest) super.clone();
    }

}
    