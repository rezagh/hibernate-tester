

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PostLoad;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;


@Entity
@Table(name="PARAMETER" )
//@Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.READ_ONLY)
public class ParameterDO implements Serializable
{
	@Id
	@Column (name="PARAM_ID")
	private Long id ;
	
	@Column (name="PARAM_LEGACY_ID")
	private String legacyID;
	
	@Column (name="PARAM_CODE")
	private String code;
	
//	@Column (name="PARAM_TYPE")
//	private String type;
	
	@Column (name="PARAM_NAME")
	private String name;
	
	//STRING_ID
	
	@Column (name="PARAM_DESCRIPTION")
	private String description;
	
	//PARAM_DESC_STRING_ID
	
	@Column (name="PARAM_SHORT_DESCRIPTION")
	private String shortDesc;
	
	public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (!(obj instanceof ParameterDO)) return false;
        ParameterDO pk = (ParameterDO) obj;
        if (pk.getId() == null) return false;
        return pk.getId().equals(id);
    }

    public int hashCode() {
    	return (id == null) ? 0 : id.hashCode();
    }	

//----------------------------------------------
	public Long getId()
	{
		return id;
	}

	public void setId( Long id )
	{
		this.id = id;
	}

	public String getLegacyID()
	{
		return legacyID;
	}

	public void setLegacyID( String legacyID )
	{
		this.legacyID = legacyID;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode( String code )
	{
		this.code = code;
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription( String description )
	{
		this.description = description;
	}

	public String getShortDesc()
	{
		return shortDesc;
	}

	public void setShortDesc( String shortDesc )
	{
		this.shortDesc = shortDesc;
	}

	public ParameterEnum getCodeEnum()
	{
		return codeEnum;
	}

	public void setCodeEnum( ParameterEnum codeEnum )
	{
		this.codeEnum = codeEnum;
	}
}