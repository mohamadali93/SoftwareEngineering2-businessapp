package com.businessapp.repositories;

import java.util.List;

import com.businessapp.model.Article;


/**
 * Public interface to access Article repository with CRUD methods (Create, Read, Update, Delete).
 *
 * @author Sven Graupner
 *
 */
public interface ArticleRepositoryIntf extends RepositoryIntf<Article> {


	/**
	 * Create a new Article entity that is *not* yet managed in the repository.
	 * A new entity is added to the repository using the update() method.
	 *
	 * @return new Article entity instance that is not yet managed in the repository.
	 */
	public Article create();


	/**
	 * Read method that returns all entities of the repository.
	 *
	 * @return all entities of the repository.
	 */
	@Override
	public List<Article> findAll();


	/**
	 * Read method that returns the repository entity with matching id or null if
	 * entity is not found.
	 *
	 * @return entity with matching id.
	 */
	@Override
	public Article findById( String id );


	/**
	 * Update method that sets values of entity passed as argument to an entity
	 * found in the repository with same id. If no entity with matching id is found,
	 * the entity passed as argument is inserted into the repository if the insert
	 * flag is set to true. If set to false, no update is performed.
	 *
	 * @e entity to update values of repository entity with matching id.
	 * @insert if true, entity is inserted if no entity with matching id exists.
	 * @return reference to updated entity.
	 */
	@Override
	public Article update( Article e, boolean insert );


	/**
	 * Delete entity with matching id from repository.
	 *
	 * @id id of entity to be deleted from repository.
	 */
	@Override
	public void delete( String id );


	/**
	 * Delete all entities passed as argument from repository as one atomic transaction.
	 *
	 * @ids list of entities to be deleted from repository.
	 */
	@Override
	public void delete( List<String> ids );


	/**
	 * Delete all entities from repository as one atomic transaction. The result
	 * is an empty repository.
	 */
	@Override
	public void deleteAll();

}
