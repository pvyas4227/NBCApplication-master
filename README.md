Pratik Vyas
NBCU test automation task





Steps followed:-
Test was performed in android environment using espresso, charles proxy, eclipse

1) Start espresso

2) If apk source code available then Configure else take into account the Given URL and other data

3) In the given parameter I initialised Espresso to Listen to the CharlesProxy http/https based messages.

4) Makesure "Enable SSL Proxying" is checked in proxy settings as it may otherwise cause issues in certain environments.

5) for IOS configure the network through wifi settings and use manual proxy by entering the computer IP address as the Charles Server.

6) In our case, an Android emulator was configured by adding an Additional Emulator Command Line Option:
-http-proxy http://LOCAL_IP:8888
  Where LOCAL_IP is the IP address of the computer instead of the emulator

7) we will need to pass the IP of our Charles Proxy as an environment variable, Once the emulator is opened, we will install the certificate that gives us Charles Proxy by opening from our mobile browser this URL

8) Go to Charles Proxy and click "start recording" button. This gives us the traffic details that go through the emulated android device.

9) Visit the given NBC app page and click on the jimmy fallon video as per the requirement

10) Video starts and we can see httpp/https mesage data on charles proxy.

11) Through the coding IDE, create methods for Event Listening to intercept the event type and a method to assert the value of obtained event type from the Heartbeat Ping.

12) If the required event type or value is present, set assertion value to be true else assert false.

As the http message was already Given to us as a static value, hence i have parsed the value and event type and asserted true on the basis of available input.
