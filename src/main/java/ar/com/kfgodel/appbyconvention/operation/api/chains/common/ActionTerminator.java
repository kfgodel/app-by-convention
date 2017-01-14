package ar.com.kfgodel.appbyconvention.operation.api.chains.common;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * This type represents a started action chain that can end itself by defining a final action.<br>
 * The methods in this type allows you to end the chain by defining the last action, and execute all the chain
 * Created by kfgodel on 14/01/17.
 */
public interface ActionTerminator<I> extends Supplier<I> {
  /**
   * Adds the given action to the chain as the final action. It won't produce a result.
   * This methods executes all the previous actions in the chain
   *
   * @param finalAction The action to execute for last
   */
  default void useIn(Consumer<I> finalAction) {
    I generatedValue = get();
    finalAction.accept(generatedValue);
  }
}
