package sernet.gs.reveng;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * MMetastatus entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see sernet.gs.reveng.MMetastatus
 * @author MyEclipse Persistence Tools
 */

public class MMetastatusDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(MMetastatusDAO.class);
	// property constants
	public static final String GUID = "guid";

	public void save(MMetastatus transientInstance) {
		log.debug("saving MMetastatus instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MMetastatus persistentInstance) {
		log.debug("deleting MMetastatus instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MMetastatus findById(java.lang.Short id) {
		log.debug("getting MMetastatus instance with id: " + id);
		try {
			MMetastatus instance = (MMetastatus) getSession().get(
					"sernet.gs.reveng.MMetastatus", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MMetastatus instance) {
		log.debug("finding MMetastatus instance by example");
		try {
			List results = getSession().createCriteria(
					"sernet.gs.reveng.MMetastatus").add(
					Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding MMetastatus instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MMetastatus as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByGuid(Object guid) {
		return findByProperty(GUID, guid);
	}

	public List findAll() {
		log.debug("finding all MMetastatus instances");
		try {
			String queryString = "from MMetastatus";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MMetastatus merge(MMetastatus detachedInstance) {
		log.debug("merging MMetastatus instance");
		try {
			MMetastatus result = (MMetastatus) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MMetastatus instance) {
		log.debug("attaching dirty MMetastatus instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MMetastatus instance) {
		log.debug("attaching clean MMetastatus instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}