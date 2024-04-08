package worken;

import worken.wallet.repositories.WalletRepository;

public class WorkenSdk {

  private WalletRepository walletRepository;

  /**
   * Function to start workenSdk
   * @param polygonApiKey key is must have to start application,
   *                      <a href="https://polygonscan.com/myapikey">polygonApiKey</a>
   *
   */
  public void start(String polygonApiKey) {
    this.walletRepository = new WalletRepository();
  }

  public WalletRepository getWalletRepository() {
    return walletRepository;
  }
  
}
