package com.example.cirp.domain;

import com.example.cirp.Components;
import com.example.cirp.ComponentsImpl;
import com.example.cirp.CounterApi;
import com.google.protobuf.Empty;
import kalix.javasdk.valueentity.ValueEntity;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

public abstract class AbstractCounter extends ValueEntity<CounterDomain.CounterState> {

  protected final Components components() {
    return new ComponentsImpl(commandContext());
  }

  public abstract Effect<Empty> increase(CounterDomain.CounterState currentState, CounterApi.IncreaseValue increaseValue);

  public abstract Effect<Empty> decrease(CounterDomain.CounterState currentState, CounterApi.DecreaseValue decreaseValue);

  public abstract Effect<Empty> reset(CounterDomain.CounterState currentState, CounterApi.ResetValue resetValue);

  public abstract Effect<CounterApi.CurrentCounter> getCurrentCounter(CounterDomain.CounterState currentState, CounterApi.GetCounter getCounter);

}
