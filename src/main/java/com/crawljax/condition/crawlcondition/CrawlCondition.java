/**
 * 
 */
package com.crawljax.condition.crawlcondition;

import java.util.ArrayList;

import com.crawljax.condition.Condition;
import com.crawljax.condition.ConditionType;


/**
 * @author Danny
 * @version $Id: CrawlCondition.java 6234 2009-12-18 13:46:37Z mesbah $
 * A Crawl condition is a condition which should be satisfied in order to crawl the current state
 */
public class CrawlCondition extends ConditionType {

	/**
	 * @param description Description of the condition.
	 * @param crawlConditionCondition Actual condition.
	 */
	public CrawlCondition(String description, Condition crawlConditionCondition) {
		super(description, crawlConditionCondition);
	}

	/**
	 * @param description Description of the condition.
	 * @param crawlConditionCondition Actual condition.
	 * @param preConditions Preconditions to check first.
	 */
	public CrawlCondition(String description, Condition crawlConditionCondition,
	                Condition... preConditions) {
		super(description, crawlConditionCondition, preConditions);
	}

	/**
	 * @param description Description of the condition.
	 * @param crawlConditionCondition Actual condition.
	 * @param preConditions Preconditions to check first.
	 */
	public CrawlCondition(String description, Condition crawlConditionCondition,
	                ArrayList<Condition> preConditions) {
		super(description, crawlConditionCondition, preConditions);
	}

	/**
	 * 
	 * @return Returns the actual crawl condition.
	 */
	public Condition getCrawlCondition() {
		return getCondition();
	}

}
