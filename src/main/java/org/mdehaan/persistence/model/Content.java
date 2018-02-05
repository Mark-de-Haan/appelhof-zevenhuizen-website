package org.mdehaan.persistence.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "contents")
public class Content implements Serializable
{
	/**
	 * auto generated id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;

	/**
	 * namespace column specifies the content type e.g. assortment, agenda, or home
	 */
	@Column(nullable = false, name = "namespace")
	private String namespace;

	/**
	 * creation date of an entity used to sort content on the website
	 */
	@Column(name = "created_date", updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	/**
	 * text in raw HTML
	 */
	@Column(nullable = false, name = "text")
	private String text;

	public Content()
	{
	}

	public Content(String namespace, String text)
	{
		super();
		this.namespace = namespace;
		this.text = text;
	}

	public String getNamespace()
	{
		return namespace;
	}

	public Long getId()
	{
		return id;
	}

	public String getText()
	{
		return text;
	}

	public Date getCreatedDate()
	{
		return createdDate;
	}

	@Override
	public boolean equals(Object content)
	{
		if (content == null) return false;
		if (this.getClass() != content.getClass()) return false;

		return Objects.equals(id, ((Content) content).getId());
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((namespace == null) ? 0 : namespace.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

}
