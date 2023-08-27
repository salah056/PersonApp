package org.example.Aug24Interface;


interface DatabaseInterface {
    void connect(String url, String username, String password);
    void disconnect();
    void saveData(String data);
    void retrieveData();
}
