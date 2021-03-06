package org.swrlapi.bridge.converters;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.swrlapi.exceptions.TargetSWRLRuleEngineException;
import org.swrlapi.sqwrl.SQWRLQuery;

/**
 * Interface for defining a native rule engine representation of a SQWRL query.
 *
 * @see org.swrlapi.sqwrl.SQWRLQuery
 */
public interface TargetRuleEngineSQWRLQueryConverterEx<T> extends TargetRuleEngineConverter
{
  /**
   * @param query A SQWRL query
   * @throws TargetSWRLRuleEngineException If an error occurs in the target rule engine
   * @return The converted query
   */
  @NonNull T convert(@NonNull SQWRLQuery query) throws TargetSWRLRuleEngineException;
}
