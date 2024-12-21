# Java-Care-Wellness 
## Java-Care-Wellness é um sistema de plano de saúde desenvolvido em Java e Spring Boot. 
Ele fornece uma API REST para gerenciar o cadastro de beneficiários e seus documentos.

## Instalação Para instalar e configurar o projeto localmente, siga os passos abaixo: 
Clone o repositório: https://github.com/RevRicardo/Java-Care-Wellness.git

# Utilização do Sistema
## A API REST utiliza os endpoints:
### BENEFICIÁRIO
POST /Beneficiario: Adicionar novo beneficiário
patch /Beneficiario: Altera dados do beneficiário pelo idBeneficiario
GET /Todos Beneficiarios: Listar todos os beneficiario
GET /Beneficiario pelo ID: Lista beneficiario pelo idBeneficiario
DELETE /Beneficiário pelo ID: Deleta beneficiario pelo idBeneficiario
### DOCUMENTO
POST /Documento: Adicionar novo documento do beneficiário
patch /Docuemtno: Altera documento do beneficiário pelo idBeneficiario e idDocumento
GET /Documento: Listar todos documentos do beneficiario pelo idBeneficiario
GET /Doc do Beneficiario pelo ID: Lista documento do beneficiario pelo idBeneficiario e idDocumento
DELETE /Doc do Beneficiário pelo ID: Deleta documento do beneficiario pelo idBeneficiario e idDocumento

# Autor
Ricardo Gomes Barbosa Lacerda

# Direção e Supervisão
Wakanda - Rodrigo

