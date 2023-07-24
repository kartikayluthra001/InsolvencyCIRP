package com.example.cirp.domain;

import com.example.cirp.RegistrationAPI;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Empty;
import com.google.protobuf.EmptyProto;
import kalix.javasdk.valueentity.ValueEntityContext;
import kalix.javasdk.valueentity.ValueEntityOptions;
import kalix.javasdk.valueentity.ValueEntityProvider;

import java.util.function.Function;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

/**
 * A value entity provider that defines how to register and create the entity for
 * the Protobuf service <code>RegistrationService</code>.
 *
 * Should be used with the <code>register</code> method in {@link kalix.javasdk.Kalix}.
 */
public class RegisterationProvider implements ValueEntityProvider<RegisterationDomain.RegisterState, Registeration> {

  private final Function<ValueEntityContext, Registeration> entityFactory;
  private final ValueEntityOptions options;

  /** Factory method of RegisterationProvider */
  public static RegisterationProvider of(Function<ValueEntityContext, Registeration> entityFactory) {
    return new RegisterationProvider(entityFactory, ValueEntityOptions.defaults());
  }

  private RegisterationProvider(
      Function<ValueEntityContext, Registeration> entityFactory,
      ValueEntityOptions options) {
    this.entityFactory = entityFactory;
    this.options = options;
  }

  @Override
  public final ValueEntityOptions options() {
    return options;
  }

  public final RegisterationProvider withOptions(ValueEntityOptions options) {
    return new RegisterationProvider(entityFactory, options);
  }

  @Override
  public final Descriptors.ServiceDescriptor serviceDescriptor() {
    return RegistrationAPI.getDescriptor().findServiceByName("RegistrationService");
  }

  @Override
  public final String entityType() {
    return "Register";
  }

  @Override
  public final RegisterationRouter newRouter(ValueEntityContext context) {
    return new RegisterationRouter(entityFactory.apply(context));
  }

  @Override
  public final Descriptors.FileDescriptor[] additionalDescriptors() {
    return new Descriptors.FileDescriptor[] {
      EmptyProto.getDescriptor(),
      RegisterationDomain.getDescriptor(),
      RegistrationAPI.getDescriptor()
    };
  }
}
