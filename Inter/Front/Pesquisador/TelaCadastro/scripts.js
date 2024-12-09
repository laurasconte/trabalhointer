document.getElementById('cadastroForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Impede o envio do formulário para fins de validação

    // Validação simples: Verificar se os campos obrigatórios foram preenchidos
    const nome = document.getElementById('nome').value;
    const email = document.getElementById('email').value;
    const telefone = document.getElementById('telefone').value;
    const termos = document.getElementById('termos').checked;

    if (!nome || !email || !telefone || !termos) {
        alert('Por favor, preencha todos os campos obrigatórios e aceite os termos.');
        return;
    }

    // Se a validação for bem-sucedida, mostrar o feedback
    document.getElementById('feedback').style.display = 'block';
    document.getElementById('cadastroForm').reset(); // Limpar o formulário após envio
});
