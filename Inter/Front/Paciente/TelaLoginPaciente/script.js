document.getElementById("login-form").addEventListener("submit", function(event) {
    event.preventDefault();
    
    // Simulando a validação do login
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;

    if (email && password) {
        alert("Login bem-sucedido! Redirecionando...");
        // Aqui você pode adicionar o código para redirecionar o paciente após o login, ex: window.location.href = "painel-paciente.html";
    } else {
        alert("Por favor, preencha todos os campos.");
    }
});
