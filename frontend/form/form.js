async function submitForm() {
    const form = document.getElementById('employeeForm');
    const formData = new FormData(form);

    // Преобразуем FormData в объект JSON
    const data = {};
    formData.forEach((value, key) => {
        data[key] = value;
    });

    // Отправляем запрос с JSON
    const response = await fetch('http://localhost:8080/api/employees', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(data),
    });

    if (response.ok) {
        const result = await response.json();
        console.log('Employee created:', result);
        // window.location.href="main.html"    
    } else {
        console.error('Error creating employee');
        alert('Failed to create employee');
    }
}

