package org.mdehaan.persistence.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Content
{
	/**
	 * auto generated id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	/**
	 * namespace column specifies the content type e.g. assortment, agenda, or home
	 */
	@Column(nullable = false)
	private String namespace;

	/**
	 * creation date of an entity used to sort posts on the website
	 */
	@Column(nullable = false, updatable = false)
	@CreationTimestamp
	private Date created_at;

	/**
	 * content in raw HTML
	 */
	@Column(nullable = false)
	private String content;

	public Content(String namespace, String content)
	{
		super();
		this.namespace = namespace;
		this.content = content;
	}

	public String getNamespace()
	{
		return namespace;
	}
}
