<template>
    <div class="container application-wrapper">
        <header>
            <navigation-bar/>
        </header>

        <main role="main">
            <main-content/>
        </main>

        <footer class="container">
            <p class="float-right"><a href="#">Back to top</a></p>
            <p>© 2018 Mark de Haan</p>
        </footer>
    </div>
</template>

<script>
  import MainContent from './components/MainContent'
  import NavigationBar from './components/NavigationBar'

  export default {
    name: 'app',
    components: {
      MainContent,
      NavigationBar
    }
  }
</script>
