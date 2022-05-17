$(document).on("submit", "#btnRegistracija", function (event) {
    alert("Kliknuto");
//
//    event.preventDefault();
//
//    // preuzimamo vrednosti unete u formi
//    let ime = $("#ime").val();
//    let prezime = $("#prezime").val();
//    let korisnickoIme = $("#korisnicko_ime").val();
//    let pol = $("#pol").val();
//    let lozinka = $("#lozinka").val();
//    let datum = $("#datum_rodjenja").val();
//
//
//    let Korisnik = {
//        ime,
//        prezime,
//        korisnickoIme,
//        pol,
//        lozinka,
//        datum
//    }
//
//
//    $.ajax({
//        type: "POST",
//        url: "http://localhost:8080/api/registracija",
//        dataType: "json",
//        contentType: "application/json",
//        data: JSON.stringify(Korisnik),
//        success: function (response) {
//            alert("Uspesno registrovanje");
//            window.location.href = "prijavljivanje.html";
//        },
//        error: function () {
//            alert("Fail");
//            alert("Greška prilikom Registracije!");
//        }
//    });
});