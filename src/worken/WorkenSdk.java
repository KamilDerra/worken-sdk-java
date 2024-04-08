package worken;

import worken.wallet.controllers.WalletHistoryController;
import worken.wallet.repositories.WalletRepository;
import worken.wallet.repositories.impl.WalletRepositoryImpl;

public class WorkenSdk {

  private WalletHistoryController walletHistoryController;

  private WalletRepository walletRepository;

  /**
   * Function to start workenSdk
   * @param polygonApiKey key is must have to start application,
   *                      <a href="https://polygonscan.com/myapikey">polygonApiKey</a>
   *
   */
  public void start(String polygonApiKey) {
    this.walletHistoryController = new WalletHistoryController();
    this.walletRepository = new WalletRepositoryImpl(this.walletHistoryController);
  }

  public WalletRepository getWalletRepository() {
    return walletRepository;
  }

}
