// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package taskqueuehelpers.proxies;

public class QueueCount
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject queueCountMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TaskQueueHelpers.QueueCount";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		QueueName("QueueName"),
		WaitingCount("WaitingCount"),
		RunningCount("RunningCount");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public QueueCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected QueueCount(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject queueCountMendixObject)
	{
		if (queueCountMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, queueCountMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.queueCountMendixObject = queueCountMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'QueueCount.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static taskqueuehelpers.proxies.QueueCount initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return taskqueuehelpers.proxies.QueueCount.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static taskqueuehelpers.proxies.QueueCount initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new taskqueuehelpers.proxies.QueueCount(context, mendixObject);
	}

	public static taskqueuehelpers.proxies.QueueCount load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return taskqueuehelpers.proxies.QueueCount.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of QueueName
	 */
	public final java.lang.String getQueueName()
	{
		return getQueueName(getContext());
	}

	/**
	 * @param context
	 * @return value of QueueName
	 */
	public final java.lang.String getQueueName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.QueueName.toString());
	}

	/**
	 * Set value of QueueName
	 * @param queuename
	 */
	public final void setQueueName(java.lang.String queuename)
	{
		setQueueName(getContext(), queuename);
	}

	/**
	 * Set value of QueueName
	 * @param context
	 * @param queuename
	 */
	public final void setQueueName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String queuename)
	{
		getMendixObject().setValue(context, MemberNames.QueueName.toString(), queuename);
	}

	/**
	 * @return value of WaitingCount
	 */
	public final java.lang.Long getWaitingCount()
	{
		return getWaitingCount(getContext());
	}

	/**
	 * @param context
	 * @return value of WaitingCount
	 */
	public final java.lang.Long getWaitingCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.WaitingCount.toString());
	}

	/**
	 * Set value of WaitingCount
	 * @param waitingcount
	 */
	public final void setWaitingCount(java.lang.Long waitingcount)
	{
		setWaitingCount(getContext(), waitingcount);
	}

	/**
	 * Set value of WaitingCount
	 * @param context
	 * @param waitingcount
	 */
	public final void setWaitingCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long waitingcount)
	{
		getMendixObject().setValue(context, MemberNames.WaitingCount.toString(), waitingcount);
	}

	/**
	 * @return value of RunningCount
	 */
	public final java.lang.Long getRunningCount()
	{
		return getRunningCount(getContext());
	}

	/**
	 * @param context
	 * @return value of RunningCount
	 */
	public final java.lang.Long getRunningCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.RunningCount.toString());
	}

	/**
	 * Set value of RunningCount
	 * @param runningcount
	 */
	public final void setRunningCount(java.lang.Long runningcount)
	{
		setRunningCount(getContext(), runningcount);
	}

	/**
	 * Set value of RunningCount
	 * @param context
	 * @param runningcount
	 */
	public final void setRunningCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long runningcount)
	{
		getMendixObject().setValue(context, MemberNames.RunningCount.toString(), runningcount);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return queueCountMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final taskqueuehelpers.proxies.QueueCount that = (taskqueuehelpers.proxies.QueueCount) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
