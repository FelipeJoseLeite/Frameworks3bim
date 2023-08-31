package br.com.unipar.desingpatterns_decorator;

public class EncryptedCloudStream extends CloudStream{
    
    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }
    
    @Override
    public void write(String data){
        String encrypted = encrypt(data);
        
        stream.write(encrypted);
    }
    
    private String encrypt(String data){
        return "!#*FCJ(&BQL!)$%07";
    }
    
}
