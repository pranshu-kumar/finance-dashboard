<template>
    <div class="uk-card uk-background-muted uk-card-default uk-card-body uk-width-1-5@s">
            <ul class="uk-nav-default uk-nav-parent-icon" uk-nav>
                
                
                <li class="uk-active uk-text-lead"><a href="#">Show Stats</a></li>
                <li class="uk-text-lead"><a href="#">Show Finances</a></li>
                <li class="uk-text-lead"><a>Add/Delete Finances</a></li>

            </ul>
        </div>
</template>

<script>
export default {
  name: 'SideNav',
  props: {
    msg: String
  }
}
</script>

