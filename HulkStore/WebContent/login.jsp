<!DOCTYPE html>
<html lang="es">
	<head>
	    <meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	    
	    <!-- SEO Meta Tags -->
	    <meta name="description" content="Free mobile app HTML landing page template to help you build a great online presence for your app which will convert visitors into users">
	    <meta name="author" content="Inovatik">
	
	    <!-- OG Meta Tags to improve the way the post looks when you share the page on LinkedIn, Facebook, Google+ -->
		<meta property="og:site_name" content="" /> <!-- website name -->
		<meta property="og:site" content="" /> <!-- website link -->
		<meta property="og:title" content=""/> <!-- title shown in the actual shared post -->
		<meta property="og:description" content="" /> <!-- description shown in the actual shared post -->
		<meta property="og:image" content="" /> <!-- image link, make sure it's jpg -->
		<meta property="og:url" content="" /> <!-- where do you want your post to link to -->
		<meta property="og:type" content="article" />
	
	    <!-- Website Title -->
	    <title>Hulk Shop - Todo1</title>
	    
	    <!-- Styles -->
		<link href="css/bootstrap.css" rel="stylesheet">
	    <link href="css/fontawesome-all.css" rel="stylesheet">
	    <link href="css/swiper.css" rel="stylesheet">
		<link href="css/magnific-popup.css" rel="stylesheet">
		<link href="css/style-login.css" rel="stylesheet">
		
		<!-- Favicon  -->
	    <link rel="icon" href="images/favicon.png">
		<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
	    <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,400i,700,700i" rel="stylesheet">
	    
	</head>
	<body class="login-page sidebar-collapse">
		<!-- Navbar -->
		<nav class="navbar navbar-expand-lg bg-primary fixed-top navbar-transparent " color-on-scroll="400">
			
		  <div class="container">
		  
		    <div class="navbar-translate">
		      <a class="navbar-brand logo-image" href="index.jsp">
		        <!-- // 
		        	<img src="images/logo_admin.png" height="35px" alt="alternative" />
		        	Inicio
		        -->
		        
		        
		      </a>
		      <button class="navbar-toggler navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
		        <span class="navbar-toggler-bar top-bar"></span>
		        <span class="navbar-toggler-bar middle-bar"></span>
		        <span class="navbar-toggler-bar bottom-bar"></span>
		      </button>
		    </div>
		    <div class="collapse navbar-collapse justify-content-end" id="navigation" data-nav-image="../assets/img/blurred-image-1.jpg">
		      <ul class="navbar-nav">
		        <li class="nav-item">
		          <a class="nav-link" href="index.jsp">Volver al inicio</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="https://github.com/creativetimofficial/now-ui-kit/issues">Have an issue?</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" rel="tooltip" title="Follow us on Twitter" data-placement="bottom" href="https://twitter.com/CreativeTim" target="_blank">
		            <i class="fab fa-twitter"></i>
		            <p class="d-lg-none d-xl-none">Twitter</p>
		          </a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" rel="tooltip" title="Like us on Facebook" data-placement="bottom" href="https://www.facebook.com/CreativeTim" target="_blank">
		            <i class="fab fa-facebook-square"></i>
		            <p class="d-lg-none d-xl-none">Facebook</p>
		          </a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" rel="tooltip" title="Follow us on Instagram" data-placement="bottom" href="https://www.instagram.com/CreativeTimOfficial" target="_blank">
		            <i class="fab fa-instagram"></i>
		            <p class="d-lg-none d-xl-none">Instagram</p>
		          </a>
		        </li>
		      </ul>
		    </div>
		  </div>
		</nav>
		<!-- End Navbar -->
		<div class="page-header clear-filter" filter-color="orange">
		  <div class="page-header-image" style="background-image:url('images/bg-login.jpg')"></div>
		  <div class="content">
		    <div class="container">
		      <div class="col-md-4 ml-auto mr-auto">
		        <div class="card card-login card-plain">
		        

		          <form class="form" action="Login" method="post">
		            <div class="card-header text-center">
		              <div class="logo-container">
		                <img src="images/logo_hulk.svg" alt="">
		                <% if(session!=null){ %>
		                		
		                <% } else { %>
		                		// "Inicia sesion."
		               	<% } %>
		               	
		               	<% 
		               		// if(messageError != null) { 
		               			//response.getWriter().println(messageError);
		               		// } 
		               	%>
						
		              </div>
		            </div>
		            <div class="card-body">
		              <div class="input-group no-border input-lg">
		                <div class="input-group-prepend">
		                  <span class="input-group-text">
		                    <i class="now-ui-icons users_circle-08"></i>
		                  </span>
		                </div>
		                <input type="text" name="username" class="form-control" placeholder="Usuario...">
		              </div>
		              <div class="input-group no-border input-lg">
		                <div class="input-group-prepend">
		                  <span class="input-group-text">
		                    <i class="now-ui-icons text_caps-small"></i>
		                  </span>
		                </div>
		                <input type="password" name="password" placeholder="Contraseña..." class="form-control" />
		              </div>
		            </div>
		            <div class="card-footer text-center">
		              <button type="submit" class="btn btn-primary btn-round btn-lg btn-block">INICIAR SESION</button>
		              <div class="pull-left">
		                <h6>
		                  <a href="#Register" class="link">Create Account</a>
		                </h6>
		              </div>
		              <div class="pull-right">
		                <h6>
		                  <a href="#Help" class="link">Need Help?</a>
		                </h6>
		              </div>
		          </form>
		          </div>
		        </div>
		      </div>
		    </div>
		  </div>
		  <footer class="footer">
		    <div class="container">
		      <nav>
		        <ul>
		          <li>
		            <a href="https://www.creative-tim.com">
		              Creative Tim
		            </a>
		          </li>
		          <li>
		            <a href="http://presentation.creative-tim.com">
		              About Us
		            </a>
		          </li>
		          <li>
		            <a href="http://blog.creative-tim.com">
		              Blog
		            </a>
		          </li>
		        </ul>
		      </nav>
		      <div class="copyright" id="copyright">
		          
		      <p>Made by <a href="https://github.com/feliphegomez/" target="_blank">FelipheGomez</a>.</p>
		      </div>
		    </div>
		  </footer>
		</div>
	    	
	    <!-- Scripts -->
	    <script src="js/jquery.min.js"></script> <!-- jQuery for Bootstrap's JavaScript plugins -->
	    <script src="js/popper.min.js"></script> <!-- Popper tooltip library for Bootstrap -->
	    <script src="js/bootstrap.min.js"></script> <!-- Bootstrap framework -->
	    <script src="js/jquery.easing.min.js"></script> <!-- jQuery Easing for smooth scrolling between anchors -->
	    <script src="js/swiper.min.js"></script> <!-- Swiper for image and text sliders -->
	    <script src="js/jquery.magnific-popup.js"></script> <!-- Magnific Popup for lightboxes -->
	    <script src="js/morphext.min.js"></script> <!-- Morphtext rotating text in the header -->
	    <script src="js/validator.min.js"></script> <!-- Validator.js - Bootstrap plugin that validates forms -->
    <script src="js/scripts.js"></script> <!-- Custom scripts -->
	</body>
</html>



