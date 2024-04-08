package worken.wallet.repositories;

import worken.wallet.models.Wallet;
import worken.wallet.models.WalletBalance;
import worken.wallet.models.WalletTransaction;

public interface WalletRepository {

  WalletTransaction getHistory();

  Wallet createWallet();

  WalletBalance getBalance();

}