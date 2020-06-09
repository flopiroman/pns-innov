
package com.teamj.MyDiet.model.OpenFoodAPIModel;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "h",
    "w"
})
public class Full__________ implements Serializable
{

    @JsonProperty("h")
    private Long h;
    @JsonProperty("w")
    private Long w;
    private final static long serialVersionUID = 7601352903073154469L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Full__________() {
    }

    /**
     * 
     * @param w
     * @param h
     */
    public Full__________(Long h, Long w) {
        super();
        this.h = h;
        this.w = w;
    }

    @JsonProperty("h")
    public Long getH() {
        return h;
    }

    @JsonProperty("h")
    public void setH(Long h) {
        this.h = h;
    }

    @JsonProperty("w")
    public Long getW() {
        return w;
    }

    @JsonProperty("w")
    public void setW(Long w) {
        this.w = w;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("h", h).append("w", w).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(h).append(w).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Full__________) == false) {
            return false;
        }
        Full__________ rhs = ((Full__________) other);
        return new EqualsBuilder().append(h, rhs.h).append(w, rhs.w).isEquals();
    }

}
