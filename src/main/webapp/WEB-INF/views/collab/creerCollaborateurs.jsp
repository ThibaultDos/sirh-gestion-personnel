<!doctype html>
<html>

<head>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
        integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
        integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
        integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
        crossorigin="anonymous"></script>

    <link rel="stylesheet" media="screen" href="index.css" />

    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

</head>

<body>

    <header>
        <title>SGP App</title>

        <nav>
            <ul class="nav nav-pills nav-justified">
                <li class="nav-item">
                    <a class="nav-link disabled" href="#">Logout</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="#">collaborateurs</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Statistiques</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Activités</a>
                </li>
            </ul>
        </nav>

        <h1>Nouveau Collaborateur</h1>

    </header>

    <main>
        <form class="needs-validation" novalidate method="POST">
            <div class="form-group row">
                <div class="col-sm">
                    <label for="inputNom">Nom</label>
                    <input type="text" class="form-control" id="inputNom" name ="inputNom" required />
                    <div class="invalid-feedback">Entrez votre nom de famille SVP.</div>
                    
                    <div class="valid-feedback">Merci !</div>

                    <label for="inputPrenom">Prénom</label>
                    <input type="text" class="form-control" id="inputPrenom" name ="inputPrenom" required />
                    <div class="invalid-feedback">Entrez votre prénom de famille SVP.</div>
                    
                    <div class="valid-feedback">Merci !</div>

                    <label for="inputBirthday">Date de naissance</label>
                    <input type="date" class="form-control" id="inputBirthday" name ="inputBirthday" required />
                    <div class="invalid-feedback">Entrez votre date de naissance SVP.</div>
                    
                    <div class="valid-feedback">Merci !</div>

                    <label for="inputAdresse">Adresse</label>
                    <input type="text" class="form-control" id="inputAdresse" name ="inputAdresse" required />
                    <div class="invalid-feedback">Entrez votre adresse SVP.</div>

                    <div class="valid-feedback">Merci !</div>

                    <label for="inputNumSecu">Numéro de sécurité sociale</label>
                    <input type="text" class="form-control" id="inputNumSecu" name ="inputNumSecu" required />
                    <div class="invalid-feedback">Entrez votre numéro de sécurité sociale SVP.</div>

                    <div class="valid-feedback">Merci !</div>
                </div>


                <input type="submit" class="btn align-self-end" value="Créer" />
            </div>

        </form>


        <script>
            // Example starter JavaScript for disabling form submissions if there are invalid fields
            (function () {
                'use strict';
                window.addEventListener('load', function () {
                    // Fetch all the forms we want to apply custom Bootstrap validation styles to
                    var forms = document.getElementsByClassName('needs-validation');
                    // Loop over them and prevent submission
                    var validation = Array.prototype.filter.call(forms, function (form) {
                        form.addEventListener('submit', function (event) {
                            if (form.checkValidity() === false) {
                                event.preventDefault();
                                event.stopPropagation();
                            }
                            form.classList.add('was-validated');
                        }, false);
                    });
                }, false);
            })();
        </script>
    </main>


    <footer>
        <p class="float-right"> ©copyright - Tous droits réservés</p>
    </footer>

</body>

</html>