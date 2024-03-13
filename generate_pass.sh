Copy code
#!/bin/bash

# Função para gerar senha aleatória
generate_password() {
    local length=$1
    local password
    local charset='ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+{}[]|:;<>,.?/~'

    # Utiliza /dev/urandom para gerar bytes aleatórios e base64 para convertê-los em caracteres imprimíveis
    password=$(head /dev/urandom | tr -dc "$charset" | head -c "$length" ; echo '')

    echo "$password"
}

# Verifica se um argumento foi fornecido para o comprimento da senha
if [ -z "$1" ]; then
    echo "Uso: $0 <comprimento_da_senha>"
    exit 1
fi

# Obtém o comprimento da senha a partir do primeiro argumento
length=$1

# Chama a função para gerar a senha
password=$(generate_password "$length")

# Exibe a senha gerada
echo "Senha gerada: $password"