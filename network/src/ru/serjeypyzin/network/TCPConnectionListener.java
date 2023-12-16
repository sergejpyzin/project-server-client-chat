package ru.serjeypyzin.network;

public interface TCPConnectionListener {

    void onConnectionReady(TCPConnection tcpConnection);
    void onReceiveString(TCPConnection tcpConnection, String value);
    void onDisconnect(TCPConnection tcpConnection, String value);
    void onException(TCPConnection tcpConnection, Exception e);


}
