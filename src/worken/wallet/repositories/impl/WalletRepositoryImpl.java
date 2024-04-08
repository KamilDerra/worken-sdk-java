package worken.wallet.repositories.impl;

import java.util.Optional;
import worken.wallet.controllers.WalletHistoryController;
import worken.wallet.models.Wallet;
import worken.wallet.models.WalletBalance;
import worken.wallet.models.WalletTransaction;
import worken.wallet.repositories.WalletRepository;

public class WalletRepositoryImpl implements WalletRepository {

  final WalletHistoryController walletHistoryController;

  public WalletRepositoryImpl(WalletHistoryController walletHistoryController) {
    this.walletHistoryController = walletHistoryController;
  }

  @Override
  public WalletTransaction getHistory() {
    try {
      final WalletTransaction transaction = walletHistoryController.call();

      return transaction;
    } catch (Exception e) {
      throw e;
    }
  }

  @Override
  public Optional<Wallet> createWallet() {
    return null;
  }

  @Override
  public WalletBalance getBalance() {
    return null;
  }

}