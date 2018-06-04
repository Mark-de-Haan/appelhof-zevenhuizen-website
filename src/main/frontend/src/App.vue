<template>
    <div class="application-wrapper">
        <header>
            <navigation-bar/>
        </header>

        <main role="main">
            <image-carousel/>
            <main-content/>
        </main>

        <footer class="container">
            <p class="float-right"><a href="#">Back to top</a></p>
            <p>© 2018 Mark de Haan</p>
        </footer>
    </div>
</template>

<style>
    /* GLOBAL STYLES
-------------------------------------------------- */
    /* Padding below the footer and lighter body text */

    body {
        padding-top: 3rem;
        padding-bottom: 3rem;
        color: #5a5a5a;
    }

    /* Featurettes
    ------------------------- */

    .featurette-divider {
        margin: 5rem 0; /* Space out the Bootstrap <hr> more */
    }

    /* Thin out the marketing headings */
    .featurette-heading {
        font-weight: 300;
        line-height: 1;
        letter-spacing: -.05rem;
    }

    /* RESPONSIVE CSS
    -------------------------------------------------- */

    @media (min-width: 40em) {
        /* Bump up size of carousel content */
        .carousel-caption p {
            margin-bottom: 1.25rem;
            font-size: 1.25rem;
            line-height: 1.4;
        }

        .featurette-heading {
            font-size: 50px;
        }
    }

    @media (min-width: 62em) {
        .featurette-heading {
            margin-top: 7rem;
        }
    }
</style>

<script>
    import ImageCarousel from './components/ImageCarousel'
    import MainContent from './components/MainContent'
    import NavigationBar from './components/NavigationBar'

    export default {
        name: 'app',
        components: {
            ImageCarousel,
            MainContent,
            NavigationBar
        }
    }
</script>
