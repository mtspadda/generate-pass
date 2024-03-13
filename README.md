# Gerador de Senhas Aleatórias 🔑🔐

🇧🇷
<p>
Este script Bash gera senhas aleatórias contendo letras maiúsculas e minúsculas, caracteres especiais e números. O comprimento da senha pode ser especificado como argumento ao executar o script.
</p>

### Uso

Para utilizar este script, siga estas etapas:

1. **Clone o repositório:**

2. **Navegue até o diretório do script:**

```bash
cd seu-repositorio
```

3. **Dê permissão de execução ao script:**
```bash
chmod +x generate_pass.sh
```
4. **Caso você deseje copiar a senha ao pressionar Enter, instale o xclip

```bash
sudo apt update
sudo apt install xclip
```

5. **Execute o script, fornecendo o comprimento desejado da senha como argumento:**
```bash
./generate_pass.sh <comprimento_da_senha>
```
### Exemplo

Para gerar uma senha de 12 caracteres, execute o seguinte comando:
```bash
./generate_pass.sh 12
```
Isso gerará uma senha aleatória com 12 caracteres, contendo letras maiúsculas e minúsculas, números e caracteres especiais.

### Nota

- Este script usa o dispositivo `/dev/urandom` para gerar bytes aleatórios e, em seguida, converte esses bytes em caracteres imprimíveis usando a tabela de caracteres especificada.

- Eu pretendo fazer mais scripts em outras linguagens, mas esse pareceu o mais simples no momento para utilizar no dia-a-dia e não depender de procurar um site que gere as senhas.

---

# Random Password Generator 🔑🔐

🇬🇧
<p>
This Bash script generates random passwords containing uppercase and lowercase letters, special characters, and numbers. The length of the password can be specified as an argument when running the script.
</p>

### Usage

To use this script, follow these steps:

1. **Clone the repository:**

2. **Navigate to the script directory:**

```bash
cd your-repository
```

3. **Give execution permission to the script:**
```bash
chmod +x generate_pass.sh
```
4. **If you wish to copy the password by pressing Enter, install xclip by running the following commands:**

```bash
sudo apt update
sudo apt install xclip
```

5. **Execute the script, providing the desired length of the password as an argument:**

```bash
./generate_pass.sh <password_length>
```

### Example
To generate a 12-character password, execute the following command:
```bash
./generate_pass.sh 12
```
This will generate a random password with 12 characters, containing uppercase and lowercase letters, numbers, and special characters.

### Note
- This script uses the /dev/urandom device to generate random bytes and then converts these bytes into printable characters using the specified character table.
- I intend to create more scripts in other languages, but this one seemed the simplest at the moment for everyday use without having to rely on finding a website that generates passwords.

