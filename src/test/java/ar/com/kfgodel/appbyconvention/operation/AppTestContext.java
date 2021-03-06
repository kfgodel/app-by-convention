package ar.com.kfgodel.appbyconvention.operation;

import ar.com.dgarcia.javaspec.api.contexts.TestContext;
import ar.com.kfgodel.appbyconvention.operation.api.ApplicationOperation;
import ar.com.kfgodel.appbyconvention.operation.api.chains.ChainedSessionOperation;
import ar.com.kfgodel.appbyconvention.operation.api.chains.ChainedTransactionOperation;
import ar.com.kfgodel.appbyconvention.operation.api.chains.SessionScopedOperation;
import ar.com.kfgodel.appbyconvention.operation.api.chains.TransactionScopedOperation;

import java.util.function.Supplier;

/**
 * This type represents the test context used for procedures tests
 * Created by kfgodel on 13/03/16.
 */
public interface AppTestContext extends TestContext {

  ApplicationOperation operation();

  void operation(Supplier<ApplicationOperation> definition);

  SessionScopedOperation sessionScoped();

  void sessionScoped(Supplier<SessionScopedOperation> definition);

  TransactionScopedOperation transactionScoped();

  void transactionScoped(Supplier<TransactionScopedOperation> definition);

  ChainedSessionOperation<Integer[]> sessionChain();

  void sessionChain(Supplier<ChainedSessionOperation<Integer[]>> definition);

  ChainedTransactionOperation<Integer[]> transactionChain();

  void transactionChain(Supplier<ChainedTransactionOperation<Integer[]>> definition);
}
