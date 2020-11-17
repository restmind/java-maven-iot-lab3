const form = document.getElementById('form');
const nameOfAircraftModel = document.getElementById('nameOfAircraftModel');
const producerName = document.getElementById('producerName');
const productionYear = document.getElementById('productionYear');
const totalCapacityOfPassengers = document.getElementById('totalCapacityOfPassengers');
const tonnageInTons = document.getElementById('tonnageInTons');
const typeOfEngine = document.getElementById('typeOfEngine');
const flightRangeInKm = document.getElementById('flightRangeInKm');
const priceOfFlightInUan = document.getElementById('priceOfFlightInUan');

function showError(input, message) {
    const formControl = input.parentElement;
    formControl.className = 'form-control error';
    const small = formControl.querySelector('small');
    small.innerText = message;
}

function showSuccess(input) {
    const formControl = input.parentElement;
    formControl.className = 'form-control success';
}

function checkRequired(inputArr) {
    let isRequired = false;
    inputArr.forEach(function(input) {
        if (input.value.trim() === '') {
            showError(input, `${getFieldName(input)} is required`);
            isRequired = true;
        } else {
            showSuccess(input);
            return true;
        }
    });

    return isRequired;
}

function checkFloat(input){
    const re = /^[0-9]+\.?[0-9]*$/;
    if (re.test(input.value.trim())) {
        showSuccess(input);
        return true;
    } else {
        showError(input, 'This field should contain float');
        return false;
    }
}

function checkInt(input){
    const re = /^[0-9]+$/;
    if (re.test(input.value.trim())) {
        showSuccess(input);
        return true;
    } else {
        showError(input, 'This field should contain integer');
        return false;
    }
}
function checkStr(input){
    const re = /\w+/;
    if (re.test(input.value.trim())) {
        showSuccess(input);
        return true;
    } else {
        showError(input, 'This field should contain string');
        return false;
    }
}

function getFieldName(input) {
    return input.id.charAt(0).toUpperCase() + input.id.slice(1);
}

function checkform(){
    if(!checkRequired([nameOfAircraftModel, producerName,
        productionYear, totalCapacityOfPassengers,
        tonnageInTons, typeOfEngine,
        flightRangeInKm, priceOfFlightInUan])){
        return checkStr(nameOfAircraftModel) &&
            checkStr(producerName) &&
            checkInt(productionYear) &&
            checkInt(totalCapacityOfPassengers) &&
            checkFloat(tonnageInTons) &&
            checkStr(typeOfEngine) &&
            checkFloat(flightRangeInKm) &&
            checkFloat(priceOfFlightInUan);
    }
    else {
        return false;
    }
}