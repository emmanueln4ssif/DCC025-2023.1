/*Dayane Guimaraes Gomes Godoy - 2022265554C;
        Emmanuel Gomes Nassif - 202265555C;
        Habirou Mama - 202265563C;
        Walace Alan de Paula - 202265560C*/
package persistencia;

import java.io.*;

/**
 *
 * @author solan
 */
public class Arquivo {
    private BufferedReader bfReader;
    private BufferedWriter bfWriter;
    private String nomeArquivo;
    private char status;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        status = 'C';
    }
    
    public boolean abrirLeitura(){
        boolean sucesso = true;
        FileReader fileReader = null;
        if(status != 'C'){
            System.err.println("-- Arquivo \"" + nomeArquivo + "\" ja está aberto");
            sucesso = false;
        }
        else{
            try{
                fileReader = new FileReader(nomeArquivo);
            }catch(FileNotFoundException e){
                System.err.println("-- Arquivo \"" + nomeArquivo + "\" não encontrado");
                sucesso = false;
            }
            if(sucesso){
                status = 'R';
                bfReader = new BufferedReader(fileReader);
            }
            
        } 
        return sucesso;
        
    }
    
    public boolean abrirEscrita(){
        boolean sucesso = true;
        FileWriter fileWriter = null;
        if (status != 'C') {
            System.err.println("-- O arquivo \"" + nomeArquivo + "\" já está aberto");
            sucesso = false;
        } else {
            try {
                fileWriter = new FileWriter(nomeArquivo, true); // Abre o arquivo em modo de escrita com opção de acrescentar conteúdo
            } catch (IOException e) {
                System.err.println("-- Erro de escrita no arquivo \"" + nomeArquivo + "\"");
                sucesso = false;
            }
            if (sucesso) {
                status = 'W';
                bfWriter = new BufferedWriter(fileWriter);
            }
        }
        return sucesso;

    }
    
    public String lerLinha(){
        String linha = null;
        if(status == 'R'){
            try{
                linha = bfReader.readLine();
            }catch(IOException e){
                System.err.println("-- Erro de leitura no arquivo \"" + nomeArquivo + "\"");
            }
        }
        else{
            System.err.println("-- Arquivo \"" + nomeArquivo + "\" não está pronto para leitura");
        }
        return linha;
    }
    
    public void escreverLinha(String linha){
        if (status == 'W') {
            try {
                bfWriter.write(linha + "\n");
                bfWriter.flush();
            } catch (IOException e) {
                System.err.println("-- Erro de escrita no arquivo \"" + nomeArquivo + "\"");
            }
        } 
        else {
            System.err.println("-- Arquivo \"" + nomeArquivo + "\" não está pronto para escrita");
        }
    }
    
    public void fecharArquivo(){
        if(status == 'R'){
            try{
                bfReader.close();
                status = 'C';
            }catch(IOException e){
                System.err.println("Erro ao fechar o arquivo \"" + nomeArquivo + "\"");
            }
        }
        if(status == 'W'){
            try{
                bfWriter.close();
                status = 'C';
            }catch(IOException e){
                System.err.println("Erro ao fechar o arquivo \"" + nomeArquivo + "\"");
            }
        }
    }
    
    
}
