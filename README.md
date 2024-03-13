# Gerador de Senhas Aleatórias

Este script Bash gera senhas aleatórias contendo letras maiúsculas e minúsculas, caracteres especiais e números. O comprimento da senha pode ser especificado como argumento ao executar o script.

## Uso

Para utilizar este script, siga estas etapas:

1. **Clone o repositório:**

2. **Navegue até o diretório do script:**

cd seu-repositorio

3. **Dê permissão de execução ao script:**

chmod +x generate_pass.sh


4. **Execute o script, fornecendo o comprimento desejado da senha como argumento:**

./generate_pass.sh <comprimento_da_senha>

## Exemplo

Para gerar uma senha de 12 caracteres, execute o seguinte comando:

./generate_pass.sh 12

Isso gerará uma senha aleatória com 12 caracteres, contendo letras maiúsculas e minúsculas, números e caracteres especiais.

## Nota

Este script usa o dispositivo `/dev/urandom` para gerar bytes aleatórios e, em seguida, converte esses bytes em caracteres imprimíveis usando a tabela de caracteres especificada.
