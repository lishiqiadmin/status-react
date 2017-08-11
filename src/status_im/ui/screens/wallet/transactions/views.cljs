(ns status-im.ui.screens.wallet.transactions.views
  (:require-macros [status-im.utils.views :refer [defview]])
  (:require [status-im.components.react :as rn]
            [status-im.components.toolbar-new.view :as toolbar]
            [status-im.ui.screens.wallet.transactions.styles :as st]
            [status-im.i18n :as i18n]))

(defn unsigned-action []
  [rn/view {:style st/toolbar-buttons-container}
   [rn/text (i18n/label :t/transactions-sign-all)]])

(defn toolbar-view []
  [toolbar/toolbar
   {:title "Transactions"
    :title-style {:text-align "center"}
    :custom-action  [unsigned-action]}])

(defn main-section []
  [rn/view {:style st/main-section}])

(defview wallet-transactions []
  []
  [rn/view {:style st/wallet-transactions-container}
   [toolbar-view]
   [rn/scroll-view
    [main-section]]])
