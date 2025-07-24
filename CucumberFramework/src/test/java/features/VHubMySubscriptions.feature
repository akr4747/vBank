Feature: Verify My Subscription functionality

Background:
  Given the user is logged in and navigates to the Account Detail Page
  When the user is on the Subscriptions page

# ======================= Live Status: Service Up =======================

@vHub
Scenario: View details for Live Status - Service Up
  Then the user applies the Service Up filter and views the details

@vHub
Scenario: Submit Request Support for Live Status - Service Up
  Then the user applies the Service Up filter and submits a Request Support
   | Service Up Request Support |
   | Service Up Request Support subscription |

@vHub
Scenario: Submit Request Production for Live Status - Service Up
  Then the user applies the Service Up filter and submits a Request for Production

@vHub
Scenario: Submit Request Unsubscribe for Live Status - Service Up
  Then the user applies the Service Up filter and submits a Request to Unsubscribe
  |Request to unsubscribe the asset for Service Up|

# ======================= Live Status: Service Down =======================

@vHub
Scenario: View details for Live Status - Service Down
  Then the user applies the Service Down filter and views the details

@vHub
Scenario: Submit Request Support for Live Status - Service Down
  Then the user applies the Service Down filter and submits a Request Support
   | Service Down Request Support |
   | Service Down Request Support subscription |

@vHub
Scenario: Submit Request Production for Live Status - Service Down
  Then the user applies the Service Down filter and submits a Request for Production

@vHub
Scenario: Submit Request Unsubscribe for Live Status - Service Down
  Then the user applies the Service Down filter and submits a Request to Unsubscribe
  |Request to unsubscribe the asset for Service Down|

# ======================= Live Status: Credit Expired =======================

@vHub
Scenario: View details for Live Status - Credit Expired
  Then the user applies the Credit Expired filter and views the details

@vHub
Scenario: Submit Request Credits for Live Status - Credit Expired
  Then the user applies the Credit Expired filter and submits a Request for Credits
  | 10 |
  | Subscription Request Credit Expired  |

@vHub
Scenario: Submit Request Support for Live Status - Credit Expired
  Then the user applies the Credit Expired filter and submits a Request Support
  | Credit Expired Request Support |
  | Credit Expired Request Support subscription |

@vHub
Scenario: Submit Request Production for Live Status - Credit Expired
  Then the user applies the Credit Expired filter and submits a Request for Production

@vHub
Scenario: Submit Request Unsubscribe for Live Status - Credit Expired
  Then the user applies the Credit Expired filter and submits a Request to Unsubscribe
  |Request to unsubscribe the asset for Credit Expired|

# ======================= Live Status: Deprecated =======================

@vHub
Scenario: View details for Live Status - Deprecated
  Then the user applies the Deprecated filter and views the details

@vHub
Scenario: Submit Request Support for Live Status - Deprecated
  Then the user applies the Deprecated filter and submits a Request Support
   | Deprecate Request Support |
   | Deprecate Request Support subscription |

@vHub
Scenario: Submit Request Unsubscribe for Live Status - Deprecated
  Then the user applies the Deprecated filter and submits a Request to Unsubscribe
  |Request to unsubscribe the asset for Deprecate|
